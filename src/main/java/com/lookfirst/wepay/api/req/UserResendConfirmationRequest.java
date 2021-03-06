package com.lookfirst.wepay.api.req;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.lookfirst.wepay.api.WePayUser;

/**
 * https://stage.wepay.com/developer/reference/user
 *
 * For users who were registered via the /user/register call, this API call lets you resend the API registration confirmation email.
 *
 * @author Jon Scott Stevens
 * @author Jeff Schnitzer
 * @deprecated https://www.wepay.com/developer/reference/user-2011-01-15
 */
@Data
@EqualsAndHashCode(callSuper=false)
@Deprecated
public class UserResendConfirmationRequest extends WePayRequest<WePayUser> {

    /** A short message that will be included in the email to the user. */
    private String emailMessage;

	@Override
	public String getEndpoint() {
		return "/user/resend_confirmation";
	}
}