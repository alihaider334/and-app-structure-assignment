package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.application.LambdaApplication
import com.lambdaschool.android.organization.model.Product
import com.lambdaschool.android.organization.utils.DateUtils
import com.lambdaschool.android.organization.utils.TextUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)
        displayProductDetails((application as LambdaApplication).productOrder)
    }

    private fun displayProductDetails(product:Product) {
        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields

        productName.text=product.productName
        productDescription.text=product.productDescription
        productPrice.text=TextUtils.formatCurrency(product.productPrice)
        productTax.text=TextUtils.formatPercent(product.productDiscount)
        totalProductPrice.text=product.totalProductPrice.toString()
        orderDate.text=DateUtils.returnTodaysDate()


    }
}
