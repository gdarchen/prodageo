<?php

/**
 * Book form base class.
 *
 * @package    form
 * @subpackage book
 * @version    SVN: $Id: sfPropelFormGeneratedTemplate.php 8807 2008-05-06 14:12:28Z fabien $
 */
class BaseBookForm extends BaseFormPropel
{
  public function setup()
  {
    $this->setWidgets(array(
      'id'   => new sfWidgetFormInputHidden(),
      'name' => new sfWidgetFormInput(),
    ));

    $this->setValidators(array(
      'id'   => new sfValidatorPropelChoice(array('model' => 'Book', 'column' => 'id', 'required' => false)),
      'name' => new sfValidatorString(array('max_length' => 255, 'required' => false)),
    ));

    $this->widgetSchema->setNameFormat('book[%s]');

    $this->errorSchema = new sfValidatorErrorSchema($this->validatorSchema);

    parent::setup();
  }

  public function getModelName()
  {
    return 'Book';
  }


}
