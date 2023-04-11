package com.example.animal



import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var animals:ArrayList<Animal_DataClass>
    private lateinit var adapter:CustomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animals = ArrayList()

        var recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        animals.add(Animal_DataClass(
            "Garfield",
            "Cat",
            R.drawable.cat1,
            R.drawable.cat2,
            "Короткий опис про котів: \n " +
                    "Коти - це домашні тварини, які відносяться до родини котових. Вони мають м'яку шерсть, збитну форму тіла та гострий зір та слух. Коти здатні приручатися та жити з людьми, а їх домашні улюбленці славляться своєю незалежністю та грайливістю. Вони є хижаками та полюють на мишей, птахів та іншу дрібну дику здобич. Коти є популярними домашніми тваринами та мають велику кількість порід, розмірів та окрасів. Вони можуть жити більше 15 років та вважаються одними з найбільш улюблених домашніх тварин в світі."
        ))

        animals.add(Animal_DataClass(
            "Charlie",
            "Dog",
            R.drawable.dog1,
            R.drawable.dog2,
            "Короткий опис про собак: \n" +
                    "Собаки - це домашні тварини, які належать до родини псових. Вони мають гостру нюхову та слухову системи, відмінну від людських, та дуже вірні та прив'язані до своїх господарів. Собаки можуть виконувати різні функції, такі як сторожова охорона, пошук та рятування людей, а також служба в якості допоміжних тварин для людей з різними потребами. Вони також є відданими друзями та компаньйонами своїх власників. Собаки мають різні породи, розміри та окраси, а їх тривалість життя може бути від 8 до 20 років, залежно від породи та догляду. Собаки є одними з найпопулярніших домашніх тварин в світі та займають важливе місце в житті людей."))

        animals.add(Animal_DataClass(
            "Polly",
            "Parrot",
            R.drawable.parrot1,
            R.drawable.parrot2,
            "Короткий опис про попугаїв: \n" +
                    "Попугаї - це різноманітна родина птахів, яка складається з більше ніж 390 видів. Вони мають кольорове оперення та зазвичай живуть у тропічних та субтропічних регіонах. Більшість попугаїв є соціальними тваринами та живуть у невеликих стадах. Вони мають сильний дзьоб, який використовують для розгризання фруктів, насіння та інших рослин. Деякі види попугаїв можуть імітувати звуки, включаючи людську мову, що робить їх популярними як домашні улюбленці. Оскільки попугаї дуже розумні та соціальні, вони потребують багато уваги та догляду, якщо вони тримаються в неволі."
        ))

        adapter = CustomAdapter(animals,this)
        recyclerView.adapter = adapter


    }



}