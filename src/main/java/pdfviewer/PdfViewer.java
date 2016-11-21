/*
 * Copyright (c) TAKAHASHI,Toru 2015
 */
package pdfviewer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

/**
 * PDF文書のページを分割したり、結合したりといった簡易な操作を行うツール。
 * 
 * @author toru
 */
public class PdfViewer extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        URL url = getClass().getClassLoader().getResource("PdfView.fxml");
        Parent root = FXMLLoader.load(url);
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle("PDF simple viewer by PDFBox");
        stage.show();
    }

    /**
     * Main function used to run JavaFX 2.0 example.
     *
     * @param arguments Command-line arguments: none expected.
     */
    public static void main(final String[] arguments)
    {
        Application.launch(arguments);
    }
    
}
