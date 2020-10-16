package com.example.escreening.ui.fragtwo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FragTwoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FragTwoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Anti-Cult Undertaking fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }

}
