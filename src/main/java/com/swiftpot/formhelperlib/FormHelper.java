package com.swiftpot.formhelperlib;

import android.view.View;
import android.widget.EditText;

/**
 * Created by Rodney on 12-Feb-16.
 */
public abstract class FormHelper implements View.OnClickListener{


    public FormHelper(EditText [] editTexts){
    validateEmptyEditTexts(editTexts);
    }

    @Override
    public void onClick(View view) {

    }

    protected void validateEmptyEditTexts(EditText [] editTexts){

        for (EditText editText: editTexts) {
            if(editText.getText().toString().trim().isEmpty()){
                editText.setError("Field Cannot Be Empty");
                return;
            }

        }
    }
}
