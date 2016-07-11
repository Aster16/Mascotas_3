package com.andhire.mascotas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.andhire.*;

public class Correo extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextSubject;
    private EditText editTextMessage;

    private Button buttonSend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correo);

        editTextEmail = (EditText) findViewById(R.id.teemail);
        editTextSubject = (EditText) findViewById(R.id.tenombre);
        editTextMessage = (EditText) findViewById(R.id.tedesccontacto);

        buttonSend = (Button) findViewById(R.id.botonEnviarCorreo);
       // buttonSend.setOnClickListener(datos_usuario.this);
        enviarCorreo();
    }



    private void sendEmail() {
        //Getting content for email
        String email = editTextEmail.getText().toString().trim();
        String subject = editTextSubject.getText().toString().trim();
        String message = editTextMessage.getText().toString().trim();

        //Creating SendMail object
        SendMail sm = new SendMail(this, email, subject, message);

        //Executing sendmail to send email
        sm.execute();

    }

    public void enviarCorreo () {

        Button button1  = (Button) findViewById(R.id.botonEnviarCorreo);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                /*Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto","address@example.com", null));
                intent.putExtra(Intent.EXTRA_SUBJECT, "My Mail");
                intent.putExtra(Intent.EXTRA_TEXT   , "My Message");

                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(datos_usuario.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }*/


                sendEmail();
                /*String email = editTextEmail.getText().toString().trim();
                String subject = editTextSubject.getText().toString().trim();
                String message = editTextMessage.getText().toString().trim();

                Intent emailg = new Intent(Intent.ACTION_SEND);
                emailg.putExtra(Intent.EXTRA_EMAIL, new String[]{"sarahiceif@gmail.com"});
                emailg.putExtra(Intent.EXTRA_SUBJECT, "Hola");
                emailg.putExtra(Intent.EXTRA_TEXT, "Hola");
                emailg.setType("plain/text");
                //startActivity(Intent.createChooser(emailg, "Choose an Email client :"));

                try {
                    startActivity(Intent.createChooser(emailg, "Choose an Email client :"));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(datos_usuario.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }*/
                /*Intent itSend = new Intent(android.content.Intent.ACTION_SEND);

                itSend.setType("plain/text");

                itSend.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{ email});
                itSend.putExtra(android.content.Intent.EXTRA_SUBJECT, subject);
                itSend.putExtra(android.content.Intent.EXTRA_TEXT, message
                );

                sendEmail();*/
                //Snackbar.make(v, "HOLAA: " , Snackbar.LENGTH_SHORT).show();
            }
        });
    }
}
