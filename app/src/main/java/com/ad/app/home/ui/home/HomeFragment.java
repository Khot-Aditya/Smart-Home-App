package com.ad.app.home.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.ad.app.home.adapter.RecyclerAdapter;
import com.ad.app.home.databinding.FragmentHomeBinding;
import com.ad.app.home.model.DeviceModel;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final RecyclerView recyclerView = binding.recyclerview;


        List<DeviceModel> list = new ArrayList<>();
        DeviceModel deviceModel;

        deviceModel = new DeviceModel();
        deviceModel.setName("Spot Light 1");
        deviceModel.setActive(false);
        deviceModel.setAutomatic(false);
        deviceModel.setRunTime(10);
        list.add(deviceModel);

        deviceModel = new DeviceModel();
        deviceModel.setName("Spot Light 1");
        deviceModel.setActive(false);
        deviceModel.setAutomatic(false);
        deviceModel.setRunTime(10);
        list.add(deviceModel);

        deviceModel = new DeviceModel();
        deviceModel.setName("Spot Light 1");
        deviceModel.setActive(false);
        deviceModel.setAutomatic(false);
        deviceModel.setRunTime(10);
        list.add(deviceModel);

        deviceModel = new DeviceModel();
        deviceModel.setName("Spot Light 1");
        deviceModel.setActive(false);
        deviceModel.setAutomatic(false);
        deviceModel.setRunTime(10);
        list.add(deviceModel);

        deviceModel = new DeviceModel();
        deviceModel.setName("Spot Light 1");
        deviceModel.setActive(false);
        deviceModel.setAutomatic(false);
        deviceModel.setRunTime(10);
        list.add(deviceModel);

        deviceModel = new DeviceModel();
        deviceModel.setName("Spot Light 1");
        deviceModel.setActive(false);
        deviceModel.setAutomatic(false);
        deviceModel.setRunTime(10);
        list.add(deviceModel);



        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(new RecyclerAdapter(list, requireContext()));

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}