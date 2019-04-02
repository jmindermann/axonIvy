/**
 * 
 */
package ch.ivyteam.ivy;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import ch.ivyteam.ivy.process.engine.IRequestId;
import ch.ivyteam.ivy.process.extension.IIvyScriptEditor;
import ch.ivyteam.ivy.process.extension.IProcessExtensionConfigurationEditorEnvironment;
import ch.ivyteam.ivy.process.extension.impl.AbstractProcessExtensionConfigurationEditor;
import ch.ivyteam.ivy.process.extension.impl.AbstractUserProcessExtension;
import ch.ivyteam.ivy.scripting.language.IIvyScriptContext;
import ch.ivyteam.ivy.scripting.objects.CompositeObject;

/**
 * @author rwei
 * @version Sep 10, 2009
 */
public class ExampleProgramInterface extends AbstractUserProcessExtension
{

  /**
   * @see ch.ivyteam.ivy.process.extension.IUserProcessExtension#perform(ch.ivyteam.ivy.process.engine.IRequestId, ch.ivyteam.ivy.scripting.objects.CompositeObject, ch.ivyteam.ivy.scripting.language.IIvyScriptContext)
   */
  @Override
  public CompositeObject perform(IRequestId requestId, CompositeObject in, IIvyScriptContext context)
          throws Exception
  {
    String result = "demo";
    String param;

    // Evaluate call parameter
    param = (String) getProcessDataField(context, "in.xyz.param");

    // ===> Add here your code to call the external system <===

    // Store call result in process data
    setProcessDataField(context, "in.xyz.result", result);
    return in;
  }

  /**
   * @author rwei
   * @version Sep 10, 2009
   */
  public static class Editor extends AbstractProcessExtensionConfigurationEditor
  {

    /**
     * 
     */
    private IIvyScriptEditor demoIvyScriptField;

    /**
     * @see ch.ivyteam.ivy.process.extension.impl.AbstractProcessExtensionConfigurationEditor#createEditorPanelContent(java.awt.Container, ch.ivyteam.ivy.process.extension.IProcessExtensionConfigurationEditorEnvironment)
     */
    @Override
    protected void createEditorPanelContent(Container editorPanel,
            IProcessExtensionConfigurationEditorEnvironment editorEnvironment)
    {

      // ===> Add here your code to create new ui widgets and to add them to the editor panel here <===
      // You can use the editorEnvironment to create TextField that are ivyScript aware.

      demoIvyScriptField = editorEnvironment.createIvyScriptEditor();
      editorPanel.add(demoIvyScriptField.getComponent(), new GridBagConstraints(0, 0, 1, 1, 1.0, 0.0,
              GridBagConstraints.NORTHWEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
    }

    /**
     * @see ch.ivyteam.ivy.process.extension.impl.AbstractProcessExtensionConfigurationEditor#loadUiDataFromConfiguration()
     */
    @Override
    protected void loadUiDataFromConfiguration()
    {

      // ===> Add here your code to load data from the configuration to the ui widgets <===
      // You can use the getConfiguration() or getConfigurationProperty() methods to load the configuration

      demoIvyScriptField.setText(getConfigurationProperty("demo"));
    }

    /**
     * @see ch.ivyteam.ivy.process.extension.impl.AbstractProcessExtensionConfigurationEditor#saveUiDataToConfiguration()
     */
    @Override
    protected boolean saveUiDataToConfiguration()
    {

      // ===> Add here your code to save the data in the ui widgets to the configuration <===
      // You can use the saveConfiguration() or setConfigurationProperty() methods to save the configuration

      setConfigurationProperty("demo", demoIvyScriptField.getText());
      return true;
    }
  }

}
