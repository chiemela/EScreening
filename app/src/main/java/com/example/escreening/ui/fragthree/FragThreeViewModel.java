package com.example.escreening.ui.fragthree;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragThreeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragThreeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Student Registration fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
