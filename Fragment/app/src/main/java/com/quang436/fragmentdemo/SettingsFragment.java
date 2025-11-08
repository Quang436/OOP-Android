package com.quang436.fragmentdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.switchmaterial.SwitchMaterial;

public class SettingsFragment extends Fragment {

    private SwitchMaterial switchNotifications;
    private SwitchMaterial switchDarkMode;
    private SwitchMaterial switchAutoUpdate;
    private MaterialButton btnLogout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);

        // Khởi tạo views
        switchNotifications = view.findViewById(R.id.switch_notifications);
        switchDarkMode = view.findViewById(R.id.switch_dark_mode);
        switchAutoUpdate = view.findViewById(R.id.switch_auto_update);
        btnLogout = view.findViewById(R.id.btn_logout);

        // Xử lý sự kiện Switch Notifications
        switchNotifications.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        String status = isChecked ? "BẬT" : "TẮT";
                        Toast.makeText(getContext(),
                                "Thông báo: " + status,
                                Toast.LENGTH_SHORT).show();
                    }
                }
        );

        // Xử lý sự kiện Switch Dark Mode
        switchDarkMode.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        String status = isChecked ? "BẬT" : "TẮT";
                        Toast.makeText(getContext(),
                                "Chế độ tối: " + status,
                                Toast.LENGTH_SHORT).show();
                    }
                }
        );

        // Xử lý sự kiện Switch Auto Update
        switchAutoUpdate.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        String status = isChecked ? "BẬT" : "TẮT";
                        Toast.makeText(getContext(),
                                "Tự động cập nhật: " + status,
                                Toast.LENGTH_SHORT).show();
                    }
                }
        );

        // Xử lý sự kiện nút Logout
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(),
                        "Đã đăng xuất!",
                        Toast.LENGTH_LONG).show();

                // Có thể thêm code để quay về màn hình đăng nhập
                if (getActivity() != null) {
                    getActivity().finish();
                }
            }
        });

        return view;
    }
}