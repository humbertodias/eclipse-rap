package rap.example;

import org.eclipse.rap.rwt.application.EntryPoint;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DemoApplication implements EntryPoint {


    public int createUI() {
        final Display display = new Display();
        final Shell mainShell = new Shell(display, SWT.TITLE);
        mainShell.setText("RAP Maven Demo");
        mainShell.setMaximized(true);
        mainShell.setLayout(new GridLayout());

        Button button = new Button(mainShell, SWT.PUSH);
        button.setText("Click ME");


        final Text text = new Text(mainShell, SWT.BORDER);

        button.addSelectionListener(new SelectionAdapter() {
            public void widgetSelected(SelectionEvent event) {
                text.setText("Clicked!");
            }

        });

        mainShell.layout();
        mainShell.open();
        return 0;
    }

}
