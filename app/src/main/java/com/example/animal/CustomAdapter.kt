package com.example.animal

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val lisOfAnimals:ArrayList<Animal_DataClass>, private val context: Context):
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemButton:Button

        init{
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detal)
            itemButton = itemView.findViewById(R.id.button)
        }

    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {

        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout,viewGroup,false)
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {

        viewHolder.itemTitle.text = lisOfAnimals[i].titles
        viewHolder.itemDetail.text = lisOfAnimals[i].details
        viewHolder.itemImage.setImageResource(lisOfAnimals[i].images)

        viewHolder.itemButton.setOnClickListener {
            val passName = lisOfAnimals[i].titles
            val passDet = lisOfAnimals[i].description2
            val passImage2 = lisOfAnimals[i].images2

            val intent = Intent(context, Activity2::class.java)
            intent.putExtra("passName",passName)
            intent.putExtra("passDet",passDet)
            intent.putExtra("passImage2",passImage2)

            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return lisOfAnimals.size
    }



}