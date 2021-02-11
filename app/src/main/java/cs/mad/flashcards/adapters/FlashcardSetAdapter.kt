package cs.mad.flashcards.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class FlashcardSetAdapter() :
    RecyclerView.Adapter<FlashcardSetAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(viewGroup.context).inflate(R.layout.item_flashcard_set, viewGroup, false))
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        return null
    }
    override fun getItemCount(): Int {
        return -1
    }
}