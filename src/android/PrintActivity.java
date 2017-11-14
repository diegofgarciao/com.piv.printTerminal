package com.piv.print;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;
import android.*;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.socsi.smartposapi.printer.PrintRespCode;
import com.socsi.smartposapi.printer.Printer2;
import com.socsi.smartposapi.printer.TextEntity;


public class PrintActivity extends CordovaPlugin {

private CallbackContext callbackContext;
private String vuelta = "PIVPluginVerificado";
private String rta;

    @Override
        public boolean execute(String action, final JSONArray args, CallbackContext callbackContext){

            if(action.equals("verificarPluginJava")){
                rta = args + vuelta;
                callbackContext.success(rta);
            }

            else if (action.equals("printinTerminal")) {
                Printer2 print = Printer2.getInstance();
                print.appendTextEntity2(new TextEntity(tvPrint.getText().toString(), null, false, null));
                PrintRespCode printRespCode = print.startPrint();
                Log.i("PrintActivity", printRespCode.toString().toString());

            }
        }
}