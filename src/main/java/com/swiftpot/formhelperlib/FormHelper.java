package com.swiftpot.formhelperlib;

import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Rodney on 12-Feb-16.
 */
public abstract class FormHelper implements View.OnClickListener{

    public FormHelper(){}

    public FormHelper(EditText [] editTexts,Method nonStaticVoidMethod,Object object){
        this.editTexts = editTexts;
        this.nonStaticVoidMethod = nonStaticVoidMethod;
        this.object = object;
    }
    EditText [] editTexts;
    Method nonStaticVoidMethod;
    Object object;

    @Override
    public void onClick(View view) {
        Log.i("EmptyTag","Any of the fields Empty?"+isEditTextEmpty(editTexts));
        if(isEditTextEmpty(editTexts) == false){
        try {
            //Class c = Class.forName(nonStaticVoidMethod.getClass().getName());
            //Object t = c.newInstance();//cast(nonStaticVoidMethod.getDeclaringClass());
            nonStaticVoidMethod.invoke(object);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }else{
        //do nothing as errorText will be set On editText
    }
    }

     final protected boolean isEditTextEmpty(EditText [] editTexts) {
         boolean status = true;
         for (EditText editText : editTexts) {
             if (editText.getText().toString().trim().isEmpty()) {
                 editText.setError("Field Cannot Be Empty");
                 status = true;
                 break;
             } else {
                 //not empty,continue
                 status =false;
             }

         }

         return status;
     }
}
