package station.core;

import station.exceptions.GrantLimitException;

public interface Grantable {
	void applyForGrant(int amount) throws GrantLimitException;

}
