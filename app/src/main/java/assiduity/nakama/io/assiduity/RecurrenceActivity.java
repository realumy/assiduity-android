package assiduity.nakama.io.assiduity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class RecurrenceActivity extends AppCompatActivity{

    public static Intent newIntent(@NonNull final Context context) {
        return new Intent(context, RecurrenceActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recurrence);
    }
}