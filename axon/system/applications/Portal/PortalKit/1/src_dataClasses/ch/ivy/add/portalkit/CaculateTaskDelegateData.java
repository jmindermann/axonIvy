package ch.ivy.add.portalkit;

/**
 */
@SuppressWarnings("all")
@javax.annotation.Generated(comments="This is the java file of the ivy data class CaculateTaskDelegateData", value={"ch.ivyteam.ivy.scripting.streamInOut.IvyScriptJavaClassBuilder"})
public class CaculateTaskDelegateData extends ch.ivyteam.ivy.scripting.objects.CompositeObject
{
  /** SerialVersionUID */
  private static final long serialVersionUID = 6924481665660959080L;

  private ch.ivyteam.ivy.security.ISecurityMember currentUser;

  /**
   * Gets the field currentUser.
   * @return the value of the field currentUser; may be null.
   */
  public ch.ivyteam.ivy.security.ISecurityMember getCurrentUser()
  {
    return currentUser;
  }

  /**
   * Sets the field currentUser.
   * @param _currentUser the new value of the field currentUser.
   */
  public void setCurrentUser(ch.ivyteam.ivy.security.ISecurityMember _currentUser)
  {
    currentUser = _currentUser;
  }

  private ch.ivy.addon.portalkit.bo.RemoteTask task;

  /**
   * Gets the field task.
   * @return the value of the field task; may be null.
   */
  public ch.ivy.addon.portalkit.bo.RemoteTask getTask()
  {
    return task;
  }

  /**
   * Sets the field task.
   * @param _task the new value of the field task.
   */
  public void setTask(ch.ivy.addon.portalkit.bo.RemoteTask _task)
  {
    task = _task;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyUser> users;

  /**
   * Gets the field users.
   * @return the value of the field users; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyUser> getUsers()
  {
    return users;
  }

  /**
   * Sets the field users.
   * @param _users the new value of the field users.
   */
  public void setUsers(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyUser> _users)
  {
    users = _users;
  }

  private ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyRole> roles;

  /**
   * Gets the field roles.
   * @return the value of the field roles; may be null.
   */
  public ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyRole> getRoles()
  {
    return roles;
  }

  /**
   * Sets the field roles.
   * @param _roles the new value of the field roles.
   */
  public void setRoles(ch.ivyteam.ivy.scripting.objects.List<ch.ivy.ws.addon.IvyRole> _roles)
  {
    roles = _roles;
  }

}
