// @flow

import { createStore, combineReducers, applyMiddleware, compose } from 'redux';
import thunkMiddleware from 'redux-thunk';

// eslint-disable-next-line import/prefer-default-export
const isDev = (process.env.NODE_ENV !== 'development');

// eslint-disable-next-line
const COMPOSE_ENHANCERS = ((isDev) ? undefined : window.__REDUX_DEVTOOLS_EXTENSION_COMPOSE__) || compose;

const store = createStore(combineReducers({}),
  COMPOSE_ENHANCERS(applyMiddleware(thunkMiddleware)),
);

export default store;
