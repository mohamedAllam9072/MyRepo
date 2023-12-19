package com.allam.myrepo.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.allam.myrepo.databinding.FragmentHomeBinding;
import com.allam.myrepo.utils.dataStructure.MyStack;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);


        implementStack();
        return root;
    }

    private void implementStack() {
        MyStack stack = new MyStack(10);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
//        stack.push(50);
//        stack.push(60);
//        stack.push(70);
//        stack.push(80);
//        stack.push(90);
//        stack.push(100);
//        stack.push(110);
//
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
        stack.print();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}