/**
 * Created by Kyle on 08/07/2017.
 */
// @flow
import path from 'path';
import HtmlWebpackPlugin from 'html-webpack-plugin';

const SRC_PATH = 'src';
const BUILD_PATH = 'dist';

const WDS_PORT = 3000;

const HtmlWebpackPluginConfig = new HtmlWebpackPlugin({
  template: `./${SRC_PATH}/index.html`,
  filename: 'index.html',
  inject: 'body',
});

export default {
  entry: [
    `./${SRC_PATH}/index.jsx`,
  ],
  output: {
    filename: 'bundle.js',
    path: path.resolve(__dirname, BUILD_PATH),
    publicPath: '/',
  },
  module: {
    rules: [
      { test: /\.(js|jsx)$/, use: 'babel-loader', exclude: /node_modules/ },
    ],
  },
  resolve: {
    extensions: ['.js', '.jsx'],
  },
  devServer: {
    contentBase: `./${BUILD_PATH}`,
    port: WDS_PORT,
    hot: true,
  },
  plugins: [
    HtmlWebpackPluginConfig,
  ],
};
