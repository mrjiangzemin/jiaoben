package com.whj.jiaoben;

import com.whj.jiaoben.view.MainView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class JiaobenApplication extends AbstractJavaFxApplicationSupport {


    public static void main(String[] args) throws IOException {
        launch(JiaobenApplication.class, MainView.class,args);
    }

}
