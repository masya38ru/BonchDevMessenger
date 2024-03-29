package bonch.dev.school.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import bonch.dev.school.R

class ProfileFragment : Fragment() {
    lateinit var changePasswordButton: Button
    lateinit var passwordFragment: PasswordFragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_profile, container, false)
        changePasswordButton = view.findViewById(R.id.change_password_button)
        passwordFragment = PasswordFragment()
        changePasswordButton.setOnClickListener {
            passwordFragment.show(
                fragmentManager,
                "passwordFragment"
            )
        }
        return view
    }
}