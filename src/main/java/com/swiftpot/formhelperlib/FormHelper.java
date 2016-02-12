package com.swiftpot.formhelperlib;

import android.view.View;
import android.widget.EditText;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Rodney on 12-Feb-16.
 */
public abstract class FormHelper implements View.OnClickListener{


    public FormHelper(EditText [] editTexts,Method nonStaticVoidMethod){
        this.editTexts = editTexts;
        this.nonStaticVoidMethod = nonStaticVoidMethod;
    }
    EditText [] editTexts;
    Method nonStaticVoidMethod;

    @Override
    public void onClick(View view) {
    if(isEditTextEmpty(editTexts) == false){
        try {
            Class c = Class.forName(getClass().getName());
            Object t = c.newInstance();
            nonStaticVoidMethod.invoke(t);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (InstantiationException e){
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
