package com.example.fragranceshop

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.Shapeable
import org.w3c.dom.Text

class PAdapter (private val productsList : ArrayList<Product>) :
    RecyclerView.Adapter<PAdapter.MyViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_row,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = productsList[position]
       holder.imageView.setImageResource(currentItem.imageId)
       holder.tvName.text = currentItem.name
       holder.tvBrand.text = currentItem.brand
       holder.tvPrice.toString().toInt(currentItem.price)
       holder.tvQuantity.text = currentItem.quantity


    }

    override fun getItemCount(): Int {
        return productsList.size
    }

    class MyViewHolder(itemView : View)  : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val tvName: TextView = itemView.findViewById(R.id.textView4)
        val tvBrand: TextView = itemView.findViewById(R.id.textView3)
        val tvQuantity: TextView = itemView.findViewById(R.id.textView2)
        val tvPrice: TextView = itemView.findViewById(R.id.textView)
    }
}
