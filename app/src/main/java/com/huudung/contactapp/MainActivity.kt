package com.huudung.contactapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val contacts = ArrayList<ItemData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contacts.add(ItemData("0001", "Bố", "0904461456", "huuthom1972@gmail.com", R.drawable.b))
        contacts.add(ItemData("0002", "Mẹ", "0702189333", "phuongdo1976@gmail.com", R.drawable.m))
        contacts.add(ItemData("0003", "Chị gái", "0966937097", "nhungnt@gmail.com", R.drawable.c))
        contacts.add(ItemData("0004", "Bác Sĩ Tuấn Phó GĐ Bệnh Viện TS", "0914571389", "tuandoctor@gmail.com", R.drawable.t))
        contacts.add(ItemData("0005", "Cháu Quang", "0326942865", "nguyenducquang@gmail.com", R.drawable.q))
        contacts.add(ItemData("0006", "Chị Biển", "0388102109", "nttbien@gmail.com", R.drawable.b))
        contacts.add(ItemData("0007", "Chú Long", "0975711787", "longnt@gmail.com", R.drawable.l))
        contacts.add(ItemData("0008", "Cô Giang", "0904655910", "gianglethu@gmail.com", R.drawable.g))
        contacts.add(ItemData("0009", "Diệp Anh", "0867 281 604", "anhntd@gmail.com", R.drawable.d))
        contacts.add(ItemData("0010", "Thầy Lâm", "0978144924", "lamnv@gmail.com", R.drawable.l))
        contacts.add(ItemData("0011", "Chú Luân", "0944950156", "luancomputer@gmail.com", R.drawable.l))
        contacts.add(ItemData("0012", "Lành máy giặt", "0934094789", "lanhmaygiat@gmail.com", R.drawable.l))
        contacts.add(ItemData("0013", "Dũng", "0867831513", "adung1703@gmail.com", R.drawable.d))


        val listView = findViewById<RecyclerView>(R.id.listview)
        listView.layoutManager = LinearLayoutManager(this)
        listView.adapter = MyAdapter(contacts)
//        registerForContextMenu(listView)

    }
//    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
//        super.onCreateContextMenu(menu, v, menuInfo)
//
//        menuInflater.inflate(R.menu.my_menu, menu)
//    }
//
//    override fun onContextItemSelected(item: MenuItem): Boolean {
//        val info = item.menuInfo as AdapterView.AdapterContextMenuInfo
//        val position = info.position
//
//        if (item.itemId == R.id.call) {
//            val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:${contacts[position].phone}"))
//            startActivity(intent)
//        }
//        else if (item.itemId == R.id.mess) {
//            val intent = Intent(Intent.ACTION_SEND, Uri.parse("smsto:${contacts[position].phone}"))
//            startActivity(intent)
//        }
//        else if (item.itemId == R.id.mail) {
//            val intent = Intent(Intent.ACTION_SEND)
//            intent.type = "text/plain"
//            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("jan@example.com")) // recipients
//            intent.putExtra(Intent.EXTRA_SUBJECT, "Email subject")
//            intent.putExtra(Intent.EXTRA_TEXT, "Email message text")
//            startActivity(intent)
//        }
//        return super.onContextItemSelected(item)
//    }
}

