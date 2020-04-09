/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.powwow.web.url;

import com.liferay.portal.kernel.portlet.DefaultFriendlyURLMapper;
import com.liferay.portal.kernel.portlet.FriendlyURLMapper;
import com.liferay.powwow.web.constants.PowwowKeys;

import org.osgi.service.component.annotations.Component;

/**
 * @author Neil Griffin
 */
@Component(
	property = {
		"com.liferay.portlet.friendly-url-routes=/META-INF/friendly-url-routes/routes.xml",
		"javax.portlet.name=" + PowwowKeys.POWWOW_MEETINGS
	},
	service = FriendlyURLMapper.class
)
public class MeetingsFriendlyURLMapper extends DefaultFriendlyURLMapper {

	@Override
	public String getMapping() {
		return "meetings";
	}

}