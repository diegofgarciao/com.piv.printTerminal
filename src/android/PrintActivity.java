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
private String vuelta = "PIVPluginPrintVerificado";
private String rta;

    @Override
        public boolean execute(String action, final JSONArray args, CallbackContext callbackContext){

            if(action.equals("verificarPluginJava")){
                rta = args + vuelta;
                callbackContext.success(rta);
            }
            else if (action.equals("printinTerminal")) {
                Printer2 print = Printer2.getInstance();
                print.appendTextEntity2(new TextEntity("{center}{s}TIQUETE DE ESTACIONAMIENTO{/s}{br} {center}{s}REGULADO{/s}{br} {center}{s}SABANETA ANTIOQUIA{/s}{br} {center}{s}{b} NIT: 890.980.331-6{/b}{/s}{br}{br} {center}{h}{b}ALERTA DE COBRO{/b}{/h}{br}{br}{left}{s}{s} Fecha:2017/11/14{/s}{/s}{/left}{br}{left}{s} Hora:14:18{/s}{/left}{br}{left}{h}{b} Placa: ABC123{/b}{/h}{/left}{br}{left}{s} Zona:A03{/s}{/left}{br}{left}{s} Consecutivo:1548684{/s}{/left}{br}{left} Tarifa: 15 min - Valor: $600{/left}{br}{br}{center}{s} Senor usuario: pague el valor unicamente al informador{/s}{br}{center}{s}   Ubique este tiquete en su vehiculo con esta cara hacia arriba en un lugar visible{/s}{br}{br}{left}{b}Recomendaciones y condiciones.{/b}{/left}{br}{left}{s}{s}Conserve y asegure su tiquete, tenga presente el valor de la tarifa y los horarios. Deje su vehiculo correctamente estacionado dentro de la celda. No nos hacemos responsables por robos danos causados por terceros, terremotos, incendio, alborotos populares o asonada. Deje su vehiculo debidamente cerrado y asegurado. Las motos deben estacionar unica y exclusivamente en las celdas destinadas para ellas. Los espacios de estacionamiento no pueden usarse como deposito ni permanentes ni temporales y solo estan destinados para el estacionamiento de vehiculos. El estacionamiento en lugares no permitidos puede ocasionar penalizacion por parte del organismo de transito. Estacionarse sin cancelar el valor por el estacionamiento puede ocasionar penalizacion por parte del organismo de transito.{/s}{/s}{left}{br}{br}{center}{s}Visite nuestra pagina web{/s}{br}{center}{s}{b}www.sesvip.co{/b}{/s}{br} ", null, false, null));
                PrintRespCode printRespCode = print.startPrint();
                return printRespCode;
                Log.i("PrintActivity", printRespCode.toString().toString());
             }
            return true;
        }
}