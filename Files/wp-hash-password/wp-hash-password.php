<?php
/*
Plugin Name: WP Hash Password
Description: Replaces the pluggable wordpress function wp_hash_password()
Author: Ninos Ego
Version: 1.0.7
Author URI: http://ninosego.de/
*/

if( !function_exists('wp_hash_password') )
{
	function wp_hash_password($password)
	{
		global $wp_hasher;

		if(empty($wp_hasher))
		{
			require_once(ABSPATH . 'wp-includes/class-phpass.php');
			$wp_hasher = new PasswordHash(16, false);
		}

		return $wp_hasher->HashPassword($password);
	}
}