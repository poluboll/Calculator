package com.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.calculator.CalcLogic.parse
import com.calculator.databinding.FragmentCalcBinding
import com.example.homework.Calculator


class CalcFragment : Fragment(R.layout.fragment_calc) {
    private var _binding: FragmentCalcBinding? = null
    private val binding get() = requireNotNull(_binding)
    private var str = StringBuffer()
    val calculator: Calculator = Calculator()
    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return FragmentCalcBinding.inflate(inflater, container, false)
                .also { binding ->
                    _binding = binding
                }
                .root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            button0.setOnClickListener {
                str.append("0")
                textView.text = str
            }
            button1.setOnClickListener {
                str.append("1")
                textView.text = str
            }
            button2.setOnClickListener {
                str.append("2")
                textView.text = str
            }
            button3.setOnClickListener {
                str.append("3")
                textView.text = str
            }
            button4.setOnClickListener {
                str.append("4")
                textView.text = str
            }
            button5.setOnClickListener {
                str.append("5")
                textView.text = str
            }
            button6.setOnClickListener {
                str.append("6")
                textView.text = str
            }
            button7.setOnClickListener {
                str.append("7")
                textView.text = str
            }
            button8.setOnClickListener {
                str.append("8")
                textView.text = str
            }
            button9.setOnClickListener {
                str.append("9")
                textView.text = str
            }
            buttonPlus.setOnClickListener {
                str.append("+")
                textView.text = str
            }
            buttonMinus.setOnClickListener {
                str.append("-")
                textView.text = str
            }
            buttonDiv.setOnClickListener {
                str.append("/")
                textView.text = str
            }
            buttonMul.setOnClickListener {
                str.append("*")
                textView.text = str
            }
            buttonReset.setOnClickListener {
                str.delete(0, str.length)
                str.append("0")
                textView.text = str
                calculator.resetRegister()
            }
            buttonEquals.setOnClickListener {
                calculator.resetRegister()
              try {
                  parse(textView.text.toString(), calculator)
              }catch (e:Exception){
                  Toast.makeText(context, "ERROR", Toast.LENGTH_SHORT).show()
              }
                textView.text = calculator.register.toString()
                str.delete(0, str.length)
                str.append(calculator.register.toString())
            }


        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}