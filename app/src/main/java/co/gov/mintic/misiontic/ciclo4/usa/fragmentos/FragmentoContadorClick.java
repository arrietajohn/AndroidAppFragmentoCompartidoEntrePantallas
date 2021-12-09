package co.gov.mintic.misiontic.ciclo4.usa.fragmentos;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import co.gov.mintic.misiontic.ciclo4.usa.R;


public class FragmentoContadorClick extends Fragment {

    String estadoActual, estadoAnterior;
    int cuentaClick;
    Button btnContar, btnReinicar;
    TextView etiCuenta;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mostrasEstado("onAttach","");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mostrasEstado("onCreate",estadoActual);
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mostrasEstado("onCreateView",estadoActual);
        return inflater.inflate(R.layout.layout_fragmento_contador_click, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mostrasEstado("onViewCreated",estadoActual);
        btnContar = (Button) view.findViewById(R.id.btnCuenta);
        btnReinicar = (Button) view.findViewById(R.id.btnReinicar);
        etiCuenta = (TextView) view.findViewById(R.id.txtCuenta);
        btnContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contar(view) ;
            }
        });
        btnReinicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reiniciar(view);
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mostrasEstado("onActivityCreated",estadoActual);
    }

    @Override
    public void onStart() {
        super.onStart();
        mostrasEstado("onStart",estadoActual);
    }

    @Override
    public void onResume() {
        super.onResume();
        mostrasEstado("onResume",estadoActual);
    }

    @Override
    public void onPause() {
        super.onPause();
        mostrasEstado("onPause",estadoActual);
    }

    @Override
    public void onStop() {
        super.onStop();
        mostrasEstado("onStop",estadoActual);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mostrasEstado("onDestroyView",estadoActual);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mostrasEstado("onDestroy",estadoActual);
    }


    @Override
    public void onDetach() {
        super.onDetach();
        mostrasEstado("onDetach",estadoActual);
    }

    public void mostrasEstado(String estadoActual, String estadoAnterior){
        this.estadoActual = estadoActual;
        this.estadoAnterior = estadoAnterior;
        System.out.println("\nESTADOS DEL FRAGMENTO");
        System.out.println("ESTADO ACTUAL: "+estadoActual);
        System.out.println("ESTADO ANTERIOR: "+estadoAnterior);
    }

    /**
     * Cuenta el numero de click dados por el usuario en el boton
     * Contar y los muestra en la etiqueta Cuenta
     * @param v La vista donde fue agregado el Fragmento o la Vista
     *          Donde ocurrió el evento
     */
    public void contar(View v){
        cuentaClick ++;
        System.out.println("\nNUMEROS DE CLICK: "+cuentaClick);
        etiCuenta.setText(cuentaClick+"");
    }

    public void reiniciar(View v){
        cuentaClick = 0;
        System.out.println("\nNUMEROS DE CLICK: "+cuentaClick);
        etiCuenta.setText(cuentaClick+"");
    }
}