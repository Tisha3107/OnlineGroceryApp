package com.rajendra.Tishaonlinegroceries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetails extends AppCompatActivity {

    ImageView buy;
    private Button move3;
    ImageView img, back;
    TextView proName, proPrice, proDesc, proQty, proUnit;

    String name, price, desc, qty, unit;
    int image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details);

        buy = findViewById(R.id.imageView7);
        buy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProductDetails.this, AddToCart.class);
                startActivity(intent);
            }
        });
        Intent i = getIntent();

         name = i.getStringExtra("name");
         image = i.getIntExtra("image", R.drawable.b1);
         price = i.getStringExtra("price");
         desc = i.getStringExtra("desc");
         qty = i.getStringExtra("qty");
         unit = i.getStringExtra("unit");

         proName = findViewById(R.id.productName);
         proDesc = findViewById(R.id.prodDesc);
         proPrice = findViewById(R.id.prodPrice);
         img = findViewById(R.id.big_image);
         back = findViewById(R.id.back2);
         proQty = findViewById(R.id.qty);
         proUnit = findViewById(R.id.unit);

         proName.setText(name);
         proPrice.setText(price);
         proDesc.setText(desc);
         proQty.setText(qty);
         proUnit.setText(unit);


        img.setImageResource(image);


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(ProductDetails.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        move3=findViewById(R.id.detailbtn);
        move3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductDetails.this, BuyNow.class);
                startActivity(intent);
            }
        });



    }


   // this tutorial has been completed
    // see you in the next.
}
