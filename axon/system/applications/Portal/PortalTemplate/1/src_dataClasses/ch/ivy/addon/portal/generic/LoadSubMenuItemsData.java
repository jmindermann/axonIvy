package ch.ivy.addon.portal.generic;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class LoadSubMenuItemsData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class LoadSubMenuItemsData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -6480932634948284607L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.addon.portal.generic.menu.SubMenuItem> subMenuItems;

  /**
   * Gets the field subMenuItems.
   * @return the value of the field subMenuItems; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.addon.portal.generic.menu.SubMenuItem> getSubMenuItems()
  {
    return subMenuItems;
  }

  /**
   * Sets the field subMenuItems.
   * @param _subMenuItems the new value of the field subMenuItems.
   */
  public void setSubMenuItems(ch.ivyteam.ivy.scripting.objects.List<ch.addon.portal.generic.menu.SubMenuItem> _subMenuItems)
  {
    subMenuItems = _subMenuItems;
  }

}
