/**
 * Created by Kyle on 08/07/2017.
 */
// @flow

import 'babel-polyfill';

import React from 'react';
import ReactDOM from 'react-dom';
import { Provider } from 'react-redux';

import store from './framework/store/store';
import App from './framework/App';

const APP_CONTAINER_ID = 'app';
const ROOT_ELEMENT = document.querySelector(`#${APP_CONTAINER_ID}`);

ReactDOM.render(
  <Provider store={store}>
    <App />
  </Provider>,
  ROOT_ELEMENT,
);
