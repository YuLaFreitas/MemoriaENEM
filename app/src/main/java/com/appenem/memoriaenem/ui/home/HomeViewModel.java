package com.appenem.memoriaenem.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.appenem.memoriaenem.R;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;
    private MutableLiveData<Integer> img1, img2, img3, img4;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("O NOME DO ALUNO FICARÁ AQUI");

        img1 = new MutableLiveData<>();
        img1.setValue(R.drawable.ic_humanas);
        img2 = new MutableLiveData<>();
        img2.setValue(R.drawable.ic_matematica);
        img3 = new MutableLiveData<>();
        img3.setValue(R.drawable.ic_celebro_ideia);
        img4 = new MutableLiveData<>();
        img4.setValue(R.drawable.ic_linguas);
    }

    public LiveData<String> getText() {
        return mText;
    }

    LiveData<Integer> getRes(int i) {
        LiveData<Integer> res = null;
        switch (i) {
            case 0:
                res = img1;
            break;
            case 1:
                res = img2;
            break;
            case 2:
                res = img3;
            break;
            case 3:
                res = img4;
            break;
        }

        return res;
    }


    }