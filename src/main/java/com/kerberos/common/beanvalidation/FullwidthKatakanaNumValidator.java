/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kerberos.common.beanvalidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.apache.commons.lang3.StringUtils;

import com.kerberos.common.util.ValidateUtil;

/**
 * 全角カタカナ数値チェック
 * @author kitabayashi_y
 */
public class FullwidthKatakanaNumValidator implements ConstraintValidator<FullwidthKatakanaNum, CharSequence> {

	@Override
	public void initialize(FullwidthKatakanaNum annotation) {
	}

	@Override
	public boolean isValid(CharSequence charSequence, ConstraintValidatorContext constraintValidatorContext) {
		if (StringUtils.isEmpty(charSequence)) {
			return true;
		}

		return ValidateUtil.isFullwidthKatakanaNum(charSequence);
	}
}
