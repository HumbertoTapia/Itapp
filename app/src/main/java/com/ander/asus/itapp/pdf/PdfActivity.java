package com.ander.asus.itapp.pdf;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.ander.asus.itapp.R;
import com.github.barteksc.pdfviewer.PDFView;

public class PdfActivity extends AppCompatActivity {
    PDFView pdfView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        pdfView = findViewById(R.id.pdf_view);
        pdfView.fromAsset("manual.pdf").load();

    }
}