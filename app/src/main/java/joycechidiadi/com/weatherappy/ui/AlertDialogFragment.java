package joycechidiadi.com.weatherappy.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

import joycechidiadi.com.weatherappy.R;

import static joycechidiadi.com.weatherappy.R.string.error_okbutton;

public class AlertDialogFragment extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                        .setTitle(R.string.error_sorry)
                        .setMessage(R.string.error_messag)
                        .setPositiveButton(R.string.error_btn_Ok, null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
