package com.melo.danillo.gerenciadordeligas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import com.melo.danillo.gerenciadordeligas.model.Usuario;

public class CadastroUsuarioActivity extends AppCompatActivity {

    private TextView nome;
    private TextView email;
    private  TextView senha;
    private  TextView confirmarSenha;
    private Button btnSalvar;
    private Spinner spinner;

    private String [] sexo = new String[]{"Masculino","Feminino"};
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        nome = (TextView) findViewById(R.id.editText_nome_completo);
        email=(TextView) findViewById(R.id.editText_email);
        senha = (TextView) findViewById(R.id.editText_senha);
        btnSalvar = (Button) findViewById(R.id.btn_salvar_cadastro_usuario);
        spinner = (Spinner) findViewById(R.id.comboSexo);


         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,sexo);
         adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
         spinner.setAdapter(adapter);

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Usuario usuario = new Usuario();
                usuario.setNome(nome.getText().toString());
                usuario.setEmail(email.getText().toString());
                usuario.setSenha(senha.getText().toString());

                Intent itent = new Intent(CadastroUsuarioActivity.this,LoginActivity.class);
                itent.putExtra("email",usuario.getEmail());
                startActivity(itent);

            }
        });

    }

    public void teste(View view){
        //Intent implicita
        Uri uri = Uri.parse("23423432");
        Intent itent2 = new Intent(Intent.ACTION_CALL);

    }

}
