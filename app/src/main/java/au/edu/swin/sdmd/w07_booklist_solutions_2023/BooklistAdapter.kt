package au.edu.swin.sdmd.w07_booklist_solutions_2023

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class BooklistAdapter: RecyclerView.Adapter<BooklistAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater
            .inflate(R.layout.book_layout, parent, false) as View
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = BookStore.count

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = BookStore.books.get(position)
        holder.bind(item)
    }

    inner class ViewHolder(val v: View): RecyclerView.ViewHolder(v) {

        fun bind(item: Book) {

        }
    }
}