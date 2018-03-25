package com.vkeyws.fiqih_1202154123_modul5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class addtodo extends AppCompatActivity{

    EditText ToDo, Description, Priority;
    database dtbase;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtodo);
        //set title menjadi adddata to do
        setTitle("Add To Do");
        //mencari dengan variabel
        ToDo = (EditText) findViewById(R.id.editTodo);
        Description = (EditText) findViewById(R.id.editDesc);
        Priority = (EditText) findViewById(R.id.editPriority);
        dtbase = new database(this);
    }

    @Override

    public void onBackPressed() {
        //intent dari adddata to do menuju list to do
        Intent intent = new Intent(addtodo.this, listtodo.class);
        //memulai intent
        startActivity(intent);
        //menutup aktivitas setelah intent dijalankan
        this.finish();
    }

    //membuat aksi pada method tambah
    public void tambah(View view) {
        //apabila data todoname, deskripsi dan prioritas di isi,
        if (dtbase.inputdata(new adddata(ToDo.getText().toString(), Description.getText().toString(), Priority.getText().toString()))) {
            //menampilan toast jika berhasil
            Toast.makeText(this, "To Do List added!", Toast.LENGTH_SHORT).show();
            //mulai perpindah dari addtodo ke listtodo
            startActivity(new Intent(addtodo.this, listtodo.class));
            //menutup aktivitas agar tidak kembali ke activity yang dijalankan setelah intent
            this.finish();
        } else {
            //menampilkan toast jika gagal
            Toast.makeText(this, "Cannot adddata the list", Toast.LENGTH_SHORT).show();
            //set semua edit text menjadi kosong
            ToDo.setText(null);
            Description.setText(null);
            Priority.setText(null);
        }
    }
}
