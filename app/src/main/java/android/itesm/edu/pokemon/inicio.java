package android.itesm.edu.pokemon;
import android.app.Activity;
import android.content.Intent;
import android.view.View;



public class inicio extends Activity {

    private void goMain(String file){Intent intent = new Intent(this,MainActivity.class); }
    public void inicio(View view){
        switch(view.getId()){
            case R.id.inicio:
                String file = "inicio";
                goMain(file);
                break;

        }


    }
}
