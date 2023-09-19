package com.example.androidbootcamp_hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.androidbootcamp_hesapmakinesi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    @Override
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        val text = binding.textView

        binding.button0.setOnClickListener{
            if (text.toString() ==  "0"){
                return@setOnClickListener
            }else{
                binding.textView.text = binding.textView.text.toString().plus("0")
            }
        }

        binding.button1.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                binding.textView.text = "1"
            }else{
                binding.textView.text = binding.textView.text.toString().plus("1")
            }
        }

        binding.button2.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                binding.textView.text = "2"
            }else{
                binding.textView.text = binding.textView.text.toString().plus("2")
            }
        }

        binding.button3.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                binding.textView.text = "3"
            }else{
                binding.textView.text = binding.textView.text.toString().plus("3")
            }
        }

        binding.button4.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                binding.textView.text = "4"
            }else{
                binding.textView.text = binding.textView.text.toString().plus("4")
            }
        }

        binding.button5.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                binding.textView.text = "5"
            }else{
                binding.textView.text = binding.textView.text.toString().plus("5")
            }
        }

        binding.button6.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                binding.textView.text = "6"
            }else{
                binding.textView.text = binding.textView.text.toString().plus("6")
            }
        }

        binding.button7.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                binding.textView.text = "7"
            }else{
                binding.textView.text = binding.textView.text.toString().plus("7")
            }
        }

        binding.button8.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                binding.textView.text = "8"
            }else{
                binding.textView.text = binding.textView.text.toString().plus("8")
            }
        }

        binding.button9.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                binding.textView.text = "9"
            }else{
                binding.textView.text = binding.textView.text.toString().plus("9")
            }
        }

        binding.buttonC.setOnClickListener{
            binding.textView.text = "0"
        }

        binding.buttonEqual.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                return@setOnClickListener
            }else{
                if (binding.textView.text.toString().endsWith("+")){
                    return@setOnClickListener
                }else{
                    val rakamlar = binding.textView.text.toString().split("+")
                    var sonuc = 0
                    rakamlar.forEach{
                        sonuc += it.toInt()
                    }
                    binding.textView.text = sonuc.toString()
                }
            }
        }

        binding.buttonPlus.setOnClickListener{
            if (binding.textView.text.toString() == "0"){
                return@setOnClickListener
            }else{
                if(binding.textView.text.toString().endsWith("+")){
                    return@setOnClickListener
                }else{
                    binding.textView.text = binding.textView.text.toString().plus("+")
                }
            }
        }



        setContentView(binding.root)

    }
}
