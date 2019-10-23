package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import bonch.dev.school.R

class PasswordFragment : DialogFragment() {
    lateinit var changePasswordButton: Button
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_password, null)
        changePasswordButton = view.findViewById(R.id.change_password_button)
        changePasswordButton.setOnClickListener { dismiss() }
        return view
    }
}