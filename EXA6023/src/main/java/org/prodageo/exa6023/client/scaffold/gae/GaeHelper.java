// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
package org.prodageo.exa6023.client.scaffold.gae;

import com.google.gwt.event.shared.EventBus;
import com.google.inject.Inject;
import org.prodageo.exa6023.client.managed.request.ApplicationRequestFactory;
import org.prodageo.exa6023.client.scaffold.ScaffoldDesktopShell;
import org.prodageo.exa6023.client.scaffold.gae.*;

public class GaeHelper {

	@Inject
	public GaeHelper(ScaffoldDesktopShell shell, ApplicationRequestFactory requestFactory, EventBus eventBus) {
		// AppEngine user authentication

new GaeLoginWidgetDriver(requestFactory).setWidget(shell.getLoginWidget());

new ReloadOnAuthenticationFailure().register(eventBus);


	}
}