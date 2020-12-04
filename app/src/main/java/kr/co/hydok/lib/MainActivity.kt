package kr.co.hydok.lib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.hydok.testlibrary.ToastClass

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastClass.showToast(this,"hihi!")
    }
}