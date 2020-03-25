package com.tj.lyout;

import android.app.ExpandableListActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.AbsListView;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ExpandableListView.ExpandableListContextMenuInfo;

//ExpandableList - ��չ��/�����б�
//�̳� ExpandableListActivity ��ʵ���б�Ŀ�չ��/�����Ĺ���
public class _Expandable extends ExpandableListActivity {
 
 private ExpandableListAdapter mAdapter;

 @Override
 protected void onCreate(Bundle savedInstanceState) {
     // TODO Auto-generated method stub
     super.onCreate(savedInstanceState);

     setTitle("ExpandableList");
     
     mAdapter = new MyExpandableListAdapter();
     setListAdapter(mAdapter);
     registerForContextMenu(this.getExpandableListView());
 }

 // Ϊ�б��ÿһ��������Ĳ˵���������������Ĳ˵��� 
 @Override
 public void onCreateContextMenu(ContextMenu menu, View v,
         ContextMenuInfo menuInfo) {
     menu.setHeaderTitle("ContextMenu");
     menu.add(0, 0, 0, "ContextMenu");
 }

 // ���������Ĳ˵�����߼�
 @Override
 public boolean onContextItemSelected(MenuItem item) {
     ExpandableListContextMenuInfo info = (ExpandableListContextMenuInfo) item.getMenuInfo();
     String title = ((TextView) info.targetView).getText().toString();

     int type = ExpandableListView.getPackedPositionType(info.packedPosition);
     if (type == ExpandableListView.PACKED_POSITION_TYPE_CHILD) {
         int groupPos = ExpandableListView.getPackedPositionGroup(info.packedPosition);
         int childPos = ExpandableListView.getPackedPositionChild(info.packedPosition);
         
         Toast.makeText(this, title + " - Group Index: " + groupPos + " Child Index: " + childPos, Toast.LENGTH_SHORT).show();
         
         return true;
     } else if (type == ExpandableListView.PACKED_POSITION_TYPE_GROUP) {
         int groupPos = ExpandableListView.getPackedPositionGroup(info.packedPosition);
         Toast.makeText(this, title + " - Group Index: " + groupPos, Toast.LENGTH_SHORT).show();
         
         return true;
     }

     return false;
 }

 public class MyExpandableListAdapter extends BaseExpandableListAdapter {

     // ���б�����
     private String[] groups = 
     { 
         "group1", 
         "group2", 
         "group3",
         "group4" 
     };
     // ���б�����
     private String[][] children = 
     {
         { "child1" },
         { "child1", "child2" },
         { "child1", "child2", "child3" },
         { "child1", "child2", "child3", "child4" }
     };
     
     @Override
     public Object getChild(int groupPosition, int childPosition) {
         return children[groupPosition][childPosition];
     }

     @Override
     public long getChildId(int groupPosition, int childPosition) {
         return childPosition;
     }

     @Override
     public int getChildrenCount(int groupPosition) {
         return children[groupPosition].length;
     }

     // ȡ���б��е�ĳһ��� View
     @Override
     public View getChildView(int groupPosition, int childPosition,
             boolean isLastChild, View convertView, ViewGroup parent) {
         TextView textView = getGenericView();
         textView.setText(getChild(groupPosition, childPosition).toString());
         return textView;
     }

     @Override
     public Object getGroup(int groupPosition) {
         return groups[groupPosition];
     }

     @Override
     public int getGroupCount() {
         return groups.length;
     }

     @Override
     public long getGroupId(int groupPosition) {
         return groupPosition;
     }

     // ȡ���б��е�ĳһ��� View
     @Override
     public View getGroupView(int groupPosition, boolean isExpanded,
             View convertView, ViewGroup parent) {
         TextView textView = getGenericView();
         textView.setText(getGroup(groupPosition).toString());
         return textView;
     }

     @Override
     public boolean hasStableIds() {
         return true;
     }

     @Override
     public boolean isChildSelectable(int groupPosition, int childPosition) {
         return true;
     }
             
     // ��ȡĳһ��� View ���߼�
     private TextView getGenericView() {
         AbsListView.LayoutParams lp = new AbsListView.LayoutParams(
                 ViewGroup.LayoutParams.FILL_PARENT, 48);
         TextView textView = new TextView(_Expandable.this);
         textView.setLayoutParams(lp);
         textView.setGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
         textView.setPadding(32, 0, 0, 0);
         return textView;
     }
 }
}