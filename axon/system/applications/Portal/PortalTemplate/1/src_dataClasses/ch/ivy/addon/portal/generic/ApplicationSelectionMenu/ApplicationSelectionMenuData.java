package ch.ivy.addon.portal.generic.ApplicationSelectionMenu;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class ApplicationSelectionMenuData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class ApplicationSelectionMenuData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = -7560854663573017496L;

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.persistence.domain.Application> applications;

  /**
   * Gets the field applications.
   * @return the value of the field applications; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.persistence.domain.Application> getApplications()
  {
    return applications;
  }

  /**
   * Sets the field applications.
   * @param _applications the new value of the field applications.
   */
  public void setApplications(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.addon.portalkit.persistence.domain.Application> _applications)
  {
    applications = _applications;
  }

  private java.lang.Boolean isNotRequiredLogin;

  /**
   * Gets the field isNotRequiredLogin.
   * @return the value of the field isNotRequiredLogin; may be null.
   */
  public java.lang.Boolean getIsNotRequiredLogin()
  {
    return isNotRequiredLogin;
  }

  /**
   * Sets the field isNotRequiredLogin.
   * @param _isNotRequiredLogin the new value of the field isNotRequiredLogin.
   */
  public void setIsNotRequiredLogin(java.lang.Boolean _isNotRequiredLogin)
  {
    isNotRequiredLogin = _isNotRequiredLogin;
  }

  private java.util.List<org.primefaces.component.button.Button> menuItems;

  /**
   * Gets the field menuItems.
   * @return the value of the field menuItems; may be null.
   */
  public java.util.List<org.primefaces.component.button.Button> getMenuItems()
  {
    return menuItems;
  }

  /**
   * Sets the field menuItems.
   * @param _menuItems the new value of the field menuItems.
   */
  public void setMenuItems(java.util.List<org.primefaces.component.button.Button> _menuItems)
  {
    menuItems = _menuItems;
  }

  private java.lang.String applicationUrl;

  /**
   * Gets the field applicationUrl.
   * @return the value of the field applicationUrl; may be null.
   */
  public java.lang.String getApplicationUrl()
  {
    return applicationUrl;
  }

  /**
   * Sets the field applicationUrl.
   * @param _applicationUrl the new value of the field applicationUrl.
   */
  public void setApplicationUrl(java.lang.String _applicationUrl)
  {
    applicationUrl = _applicationUrl;
  }

  private java.lang.Boolean isWorkingOnATask;

  /**
   * Gets the field isWorkingOnATask.
   * @return the value of the field isWorkingOnATask; may be null.
   */
  public java.lang.Boolean getIsWorkingOnATask()
  {
    return isWorkingOnATask;
  }

  /**
   * Sets the field isWorkingOnATask.
   * @param _isWorkingOnATask the new value of the field isWorkingOnATask.
   */
  public void setIsWorkingOnATask(java.lang.Boolean _isWorkingOnATask)
  {
    isWorkingOnATask = _isWorkingOnATask;
  }

  private ch.ivy.addon.portalkit.enums.MenuKind menuKinds;

  /**
   * Gets the field menuKinds.
   * @return the value of the field menuKinds; may be null.
   */
  public ch.ivy.addon.portalkit.enums.MenuKind getMenuKinds()
  {
    return menuKinds;
  }

  /**
   * Sets the field menuKinds.
   * @param _menuKinds the new value of the field menuKinds.
   */
  public void setMenuKinds(ch.ivy.addon.portalkit.enums.MenuKind _menuKinds)
  {
    menuKinds = _menuKinds;
  }

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

  private ch.addon.portal.generic.menu.SubMenuItem selectedSubMenuItem;

  /**
   * Gets the field selectedSubMenuItem.
   * @return the value of the field selectedSubMenuItem; may be null.
   */
  public ch.addon.portal.generic.menu.SubMenuItem getSelectedSubMenuItem()
  {
    return selectedSubMenuItem;
  }

  /**
   * Sets the field selectedSubMenuItem.
   * @param _selectedSubMenuItem the new value of the field selectedSubMenuItem.
   */
  public void setSelectedSubMenuItem(ch.addon.portal.generic.menu.SubMenuItem _selectedSubMenuItem)
  {
    selectedSubMenuItem = _selectedSubMenuItem;
  }

}
