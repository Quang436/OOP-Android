package com.quang436.fragmentdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;

public class HomeFragment extends Fragment {

    private MaterialButton btnViewProfile;
    private MaterialButton btnViewSettings;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate layout cho fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Khởi tạo views
        btnViewProfile = view.findViewById(R.id.btn_view_profile);
        btnViewSettings = view.findViewById(R.id.btn_view_settings);

        // Xử lý sự kiện nút View Profile
        btnViewProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang ProfileFragment
                getParentFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new ProfileFragment())
                        .addToBackStack(null)
                        .commit();

                Toast.makeText(getContext(),
                        "Chuyển sang Profile",
                        Toast.LENGTH_SHORT).show();
            }
        });

        // Xử lý sự kiện nút View Settings
        btnViewSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyển sang SettingsFragment
                getParentFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new SettingsFragment())
                        .addToBackStack(null)
                        .commit();

                Toast.makeText(getContext(),
                        "Chuyển sang Settings",
                        Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }
}