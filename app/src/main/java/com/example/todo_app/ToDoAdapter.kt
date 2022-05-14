package com.example.todo_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter(
    var todos: List<Todo>
): RecyclerView.Adapter<ToDoAdapter.ToDoViewHolder>(){

    inner class ToDoViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview){
        val textView: TextView
        val cbDone: CheckBox
        init {
            textView = itemview.findViewById(R.id.tvTodo)
            cbDone = itemview.findViewById(R.id.cbDone)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoViewHolder {
     val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return ToDoViewHolder(view)
    }
    override fun getItemCount(): Int {
        return todos.size
    }

    override fun onBindViewHolder(holder: ToDoViewHolder, position: Int) {
        holder.textView.text = todos[position].title
        holder.cbDone.isChecked = todos[position].isChecked
    }

}