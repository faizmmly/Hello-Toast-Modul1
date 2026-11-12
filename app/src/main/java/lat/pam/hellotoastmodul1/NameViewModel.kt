package lat.pam.hellotoastmodul1


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class NameViewModel : ViewModel() {


    // Create a LiveData with a String
    val currentName: MutableLiveData<Int> by lazy {
        MutableLiveData<Int>()
    }
}
