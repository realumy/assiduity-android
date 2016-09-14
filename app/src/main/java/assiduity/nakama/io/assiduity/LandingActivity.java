package assiduity.nakama.io.assiduity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LandingActivity extends AppCompatActivity {

    @BindView(R.id.other_choice) EditText otherChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);
        ButterKnife.bind(this);
    }

    @SuppressWarnings("unused")
    @OnClick(R.id.next_step_button)
    public void onNextStepClick() {
        startActivity(RecurrenceActivity.newIntent(this));
    }
}
