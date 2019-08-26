package workzone.shamanic.kalkulatortestz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class Menu extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        this.setTitle("Menu Główne");

        if( getIntent().getBooleanExtra("Exit", false))
        {
            finish();
            return;
        }
    }

    public void aboutActivity(View view)
    {
        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void simpleCalculatorActivity(View view)
    {
        Intent intent = new Intent(this, SimpleCalculator.class);
        startActivity(intent);
    }

    public void advancedCalculatorActivity(View view)
    {
        Intent intent = new Intent(this, AdvancedCalculator.class);
        startActivity(intent);
    }

    public void exitApplication(View view)
    {
        Intent intent = new Intent(this, Menu.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.putExtra("Exit", true);
        startActivity(intent);
        finish();
    }
}
